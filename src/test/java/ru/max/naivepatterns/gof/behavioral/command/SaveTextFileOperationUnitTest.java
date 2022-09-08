package ru.max.naivepatterns.gof.behavioral.command;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.behavioral.command.command.SaveTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.TextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveTextFileOperationUnitTest {

    @Test
    public void givenSaveTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
        TextFileOperation openTextFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
        assertEquals("Saving file file1.txt", openTextFileOperation.execute());
    }

}
