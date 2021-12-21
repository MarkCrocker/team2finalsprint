package com.team2.FinalSprint.DatabaseTest;

import com.team2.FinalSprint.Data.MySQL.DataObject;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class MySQLTest {
    @Test
    void testData() {
        DataObject realDataObject = new DataObject();
        assertNull(realDataObject.getId());
        assertNull(realDataObject.getCompany());
        assertNull(realDataObject.getCity());
        assertNull(realDataObject.getJobOpening());
        assertNull(realDataObject.getContact());
    }
}
