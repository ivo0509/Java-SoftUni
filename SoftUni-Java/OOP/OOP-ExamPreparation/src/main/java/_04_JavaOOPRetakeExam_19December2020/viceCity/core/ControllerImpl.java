package _04_JavaOOPRetakeExam_19December2020.viceCity.core;

import _04_JavaOOPRetakeExam_19December2020.viceCity.core.interfaces.Controller;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.guns.Gun;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.guns.Pistol;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.guns.Rifle;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.neighbourhood.GangNeighbourhood;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.neighbourhood.Neighbourhood;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.players.CivilPlayer;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.players.MainPlayer;
import _04_JavaOOPRetakeExam_19December2020.viceCity.models.players.Player;
import _04_JavaOOPRetakeExam_19December2020.viceCity.repositories.interfaces.GunRepository;
import _04_JavaOOPRetakeExam_19December2020.viceCity.common.ConstantMessages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {

    private Player mainPlayer;
    private Collection<Player> civilPlayers;
    private GunRepository models;
    private Neighbourhood neighbourhood;

    public ControllerImpl() {
        this.mainPlayer = new MainPlayer();
        this.civilPlayers = new ArrayList<>();
        this.models = new GunRepository();
        this.neighbourhood = new GangNeighbourhood();
    }

    @Override
    public String addPlayer(String name) {

        this.civilPlayers.add(new CivilPlayer(name));

        return String.format(ConstantMessages.PLAYER_ADDED, name);
    }

    @Override
    public String addGun(String type, String name) {

        switch (type) {
            case "Pistol":
                this.models.add(new Pistol(name));
                break;
            case "Rifle":
                this.models.add(new Rifle(name));
                break;
            default:
                return String.format(ConstantMessages.GUN_TYPE_INVALID);
        }

        return String.format(ConstantMessages.GUN_ADDED, name, type);
    }

    @Override
    public String addGunToPlayer(String name) {


        if (!this.models.getModels().isEmpty()) {

            Gun gun = new ArrayList<>(models.getModels()).get(0);

            if (name.equals("Vercetti")) {

                this.mainPlayer.getGunRepository().add(gun);
                models.remove(gun);
                return String.format(ConstantMessages.GUN_ADDED_TO_MAIN_PLAYER, gun.getName(), this.mainPlayer.getName());

            } else {

                Player player = this.civilPlayers
                        .stream()
                        .filter(e -> e.getName().equals(name))
                        .findFirst()
                        .orElse(null);

                if (player != null) {
                    player.getGunRepository().add(gun);
                    this.models.remove(gun);
                    return String.format(ConstantMessages.GUN_ADDED_TO_CIVIL_PLAYER, gun.getName(), player.getName());
                } else {
                    return String.format(ConstantMessages.CIVIL_PLAYER_DOES_NOT_EXIST);
                }
            }
        }

        return String.format(ConstantMessages.GUN_QUEUE_IS_EMPTY);
    }

    @Override
    public String fight() {

        int initialSizeOfCivilPlayers = this.civilPlayers.size();

        this.neighbourhood.action(this.mainPlayer, this.civilPlayers);

        this.civilPlayers = this.civilPlayers
                .stream()
                .filter(Player::isAlive)
                .collect(Collectors.toList());

        if (this.mainPlayer.isAlive() && this.civilPlayers.size() == initialSizeOfCivilPlayers) {
            return String.format(ConstantMessages.FIGHT_HOT_HAPPENED);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(ConstantMessages.FIGHT_HAPPENED)).append(System.lineSeparator());
        sb.append(String.format(ConstantMessages.MAIN_PLAYER_LIVE_POINTS_MESSAGE, mainPlayer.getLifePoints())).append(System.lineSeparator());
        sb.append(String.format(ConstantMessages.MAIN_PLAYER_KILLED_CIVIL_PLAYERS_MESSAGE, initialSizeOfCivilPlayers - this.civilPlayers.size())).append(System.lineSeparator());
        sb.append(String.format(ConstantMessages.CIVIL_PLAYERS_LEFT_MESSAGE, this.civilPlayers.size()));

        return sb.toString().trim();
    }
}
