package ru.max.naivepatterns.gof.behavioral.command;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.behavioral.command.command.OpenTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.TextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenTextFileOperationUnitTest {

    @Test
    public void givenOpenTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        assertEquals("Opening file file1.txt", openTextFileOperation.execute());
    }

}
