package _02_JavaOOPRetakeExam_22Aug2020.easterRaces.io;

import _02_JavaOOPRetakeExam_22Aug2020.easterRaces.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
