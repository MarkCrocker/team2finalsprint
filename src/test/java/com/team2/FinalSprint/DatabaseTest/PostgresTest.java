package com.team2.FinalSprint.DatabaseTest;

import com.team2.FinalSprint.Data.PostgreSQL.PostgresObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class PostgresMockDataTest {
    @Test
    void testUnit() {
        PostgresObject realPostgresMockData = new PostgresObject();
        assertNull(realPostgresMockData.getId());
        assertNull(realPostgresMockData.getCompany());
        assertNull(realPostgresMockData.getCity());
        assertNull(realPostgresMockData.getJobOpening());
        assertNull(realPostgresMockData.getContact());
        assertEquals(0, realPostgresMockData.getId());

    }
}
