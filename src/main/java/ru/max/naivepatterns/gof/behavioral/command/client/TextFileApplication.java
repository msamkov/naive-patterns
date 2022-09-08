package ru.max.naivepatterns.gof.behavioral.command.client;

import ru.max.naivepatterns.gof.behavioral.command.command.OpenTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.SaveTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.TextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.invoker.TextFileOperationExecutor;
import ru.max.naivepatterns.gof.behavioral.command.receiver.TextFile;

public class TextFileApplication {

    public static void main(String[] args) {

        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }
}
