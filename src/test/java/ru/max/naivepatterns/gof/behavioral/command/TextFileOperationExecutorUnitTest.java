package ru.max.naivepatterns.gof.behavioral.command;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.behavioral.command.command.OpenTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.SaveTextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.command.TextFileOperation;
import ru.max.naivepatterns.gof.behavioral.command.invoker.TextFileOperationExecutor;
import ru.max.naivepatterns.gof.behavioral.command.receiver.TextFile;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFileOperationExecutorUnitTest {

    private static TextFileOperationExecutor textFileOperationExecutor;

    @BeforeAll
    public static void setUpTextFileOperationExecutor() {
        textFileOperationExecutor = new TextFileOperationExecutor();
    }

    @Test
    public void givenTextFileOPerationExecutorInstance_whenCalledexecuteOperationWithOpenTextOperation_thenOneAssertion() {
        TextFileOperation textFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(textFileOperation));
    }

    @Test
    public void givenTextFileOPerationExecutorInstance_whenCalledexecuteOperationWithSaveTextOperation_thenOneAssertion() {
        TextFileOperation textFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
        assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(textFileOperation));
    }

    @Test
    public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileOpenLambda_thenOneAssertion() {
        assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(() -> {return "Opening file file1.txt";}));
    }

    @Test
    public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileSaveLambda_thenOneAssertion() {
        assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(() -> {return "Saving file file1.txt";}));
    }

    @Test
    public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileOpenMethodReferenceOfExistingObject_thenOneAssertion() {
        TextFile textFile = new TextFile("file1.txt");
        assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(textFile::open));
    }

    @Test
    public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileSaveMethodReferenceOfExistingObject_thenOneAssertion() {
        TextFile textFile = new TextFile("file1.txt");
        assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(textFile::save));
    }

    @Test
    public void givenOpenTextFileOperationExecuteMethodReference_whenCalledApplyMethod_thenOneAssertion() {
        Function<OpenTextFileOperation, String> executeMethodReference = OpenTextFileOperation::execute;
        assertEquals("Opening file file1.txt", executeMethodReference.apply(new OpenTextFileOperation(new TextFile("file1.txt"))));
    }

    @Test
    public void givenSaveTextFileOperationExecuteMethodReference_whenCalledApplyMethod_thenOneAssertion() {
        Function<SaveTextFileOperation, String> executeMethodReference = SaveTextFileOperation::execute;
        assertEquals("Saving file file1.txt", executeMethodReference.apply(new SaveTextFileOperation(new TextFile("file1.txt"))));
    }

    @Test
    public void givenOpenAndSaveTextFileOperationExecutorInstance_whenCalledExecuteOperationWithLambdaExpression_thenBothAssertion() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt"));
        assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt"));
    }
}
