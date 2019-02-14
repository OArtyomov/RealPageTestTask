package com.realpage.calculator.service;

import com.realpage.calculator.commands.AbstractCommand;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.rules.ExpectedException.none;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CommandRegistryTest {

    @InjectMocks
    private CommandRegistry commandRegistry;

    @Mock
    private List<AbstractCommand> possibleCommands;

    @Mock
    private AbstractCommand command;

    @Rule
    public ExpectedException expectedException = none();

    @Test
    public void testFindCommand() {
        List<AbstractCommand> commands = new ArrayList<>();
        commands.add(command);
        when(command.isSuitableInputOperator(anyString())).thenReturn(Boolean.FALSE);
        when(possibleCommands.stream()).thenReturn(commands.stream());
        assertNull(commandRegistry.findCommand("AA"));
    }

    @Test
    public void testGetPossibleCommandsAreUnmodifiable() {
        expectedException.expect(UnsupportedOperationException.class);
        commandRegistry.getPossibleCommands().add(command);
    }
}