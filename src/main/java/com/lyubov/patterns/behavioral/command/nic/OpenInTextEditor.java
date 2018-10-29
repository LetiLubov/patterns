package com.lyubov.patterns.behavioral.command.nic;

import java.io.File;
import java.util.List;

public class OpenInTextEditor implements Command{
    List<File> list;

    public OpenInTextEditor(List<File> list) {
        this.list = list;
    }

    @Override
    public void execute() {
        System.out.println("OpenInTextEditor");
    }
}
