import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

public class SinglyLinkedListTest {


    SinglyLinkedList actual;

    @Before
    public void beforeTest() {
        actual = new SinglyLinkedList();
    }

    @Test
    public void removeMiddleElementOnEmptyListShouldReturnNull() {
        assertNull(Answer1.removeMiddleElement(actual));
    }

    @Test
    public void removeMiddleElementOnListWithOneElementShouldNull() {
        actual.push(1);
        assertNull(Answer1.removeMiddleElement(actual));

    }

    @Test
    public void evenLinkedList() {
        actual.push(4);
        actual.push(3); // this is considered as the middle element and should be removed
        actual.push(2);
        actual.push(1);
        Answer1.removeMiddleElement(actual);

        assertThat("Element with value '3' should have been removed but is not.",
                actual.isElementWithDataPresent(3), is(Boolean.FALSE));

    }

    @Test
    public void oddLinkedList() {

        actual.push(3);
        actual.push(2); // this is considered as the middle element and should be removed
        actual.push(1);
        Answer1.removeMiddleElement(actual);

        assertThat("Element with value '2' should have been removed but is not.",
                actual.isElementWithDataPresent(2), is(Boolean.FALSE));

    }
}
