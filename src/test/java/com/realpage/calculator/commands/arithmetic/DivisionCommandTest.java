package com.realpage.calculator.commands.arithmetic;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DivisionCommandTest {

    @InjectMocks
    private DivisionCommand divisionCommand;

    @Mock
    private ExecutionContext executionContext;

    @Mock
    private Consoler consoler;

    @Test
    public void testCalculateResult() {
        assertEquals(divisionCommand.calculateResult(3, 3), 1d, 0);
        assertEquals(divisionCommand.calculateResult(6, 3), 2d, 0);
    }

    @Test
    public void testGetCommandType() {
        assertEquals(divisionCommand.getCommandType(), CommandType.DEVIDE);
    }

    @Test
    public void testValidDataForExecution() {
        when(executionContext.getNumbers()).thenReturn(null);
        assertFalse(divisionCommand.validDataForExecution(executionContext));

        when(executionContext.getNumbers()).thenReturn(emptyList());
        assertFalse(divisionCommand.validDataForExecution(executionContext));


        when(executionContext.getNumbers()).thenReturn(Collections.singletonList(2d));
        assertFalse(divisionCommand.validDataForExecution(executionContext));

        List items = new ArrayList<>();
        items.add(1d);
        items.add(2d);
        when(executionContext.getNumbers()).thenReturn(items);
        assertTrue(divisionCommand.validDataForExecution(executionContext));

        items = new ArrayList<>();
        items.add(1d);
        items.add(2d);
        items.add(3d);
        items.add(4d);
        when(executionContext.getNumbers()).thenReturn(items);
        assertTrue(divisionCommand.validDataForExecution(executionContext));

        items = new ArrayList<>();
        items.add(1d);
        items.add(2d);
        items.add(3d);
        items.add(0d);
        when(executionContext.getNumbers()).thenReturn(items);
        assertFalse(divisionCommand.validDataForExecution(executionContext));

    }

    @Test
    public void testExecute() {
        List items = new ArrayList<>();
        items.add(1d);
        items.add(2d);
        items.add(4d);
        items.add(4d);
        when(executionContext.getNumbers()).thenReturn(items);
        divisionCommand.execute(executionContext);
        assertEquals(3, items.size());
        assertEquals(1d, items.get(0));
        assertEquals(2d, items.get(1));
        assertEquals(1d, items.get(2));
        verify(consoler).println(1D);

    }
}