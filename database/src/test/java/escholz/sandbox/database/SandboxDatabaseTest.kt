package escholz.sandbox.database

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class SandboxDatabaseTest {
    @Nested
    @DisplayName("Given some state")
    inner class SomeState {
        @BeforeEach
        fun beforeEach() {
            // tODO: Set Initial State
        }

        @Nested
        @DisplayName("When the value of X changes")
        inner class IncreaseXByFive {
            @BeforeEach
            fun beforeEach() {
                // TODO: Set a value for X
            }

            @Test
            fun `Then the value of Y should be null`() {
                // TODO: Assert that Y is null
                assertTrue(true)
            }
        }
    }
}