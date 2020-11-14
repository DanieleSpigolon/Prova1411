////////////////////////////////////////////////////////////////////
// [Prova] [Prova] [1100]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TakeAwayBillExceptionTest {

    private static TakeAwayBillException takeAwayBillException;

    @BeforeClass
    public static void beforeClass() {
        takeAwayBillException = new TakeAwayBillException("Messaggio di Test");
    }

    @Test
    public void testGetMessage() {
        assertEquals("Messaggio di Test", takeAwayBillException.getMessage());
    }

}