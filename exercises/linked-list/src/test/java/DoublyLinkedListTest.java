import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> subject;

    @Before
    public void setUp() {
        subject = new DoublyLinkedList<>();
    }


    @Test
    public void testPushPop() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.pop(), is(20));
        assertThat(subject.pop(), is(10));
    }

    @Ignore("Remove to run test")
    @Test
    public void testPushShift() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.shift(), is(10));
        assertThat(subject.shift(), is(20));
    }

    @Ignore("Remove to run test")
    @Test
    public void testUnshiftShift() {
        subject.unshift(10);
        subject.unshift(20);
        assertThat(subject.shift(), is(20));
        assertThat(subject.shift(), is(10));
    }

    @Ignore("Remove to run test")
    @Test
    public void testUnshiftPop() {
        subject.unshift(10);
        subject.unshift(20);
        assertThat(subject.pop(), is(10));
        assertThat(subject.pop(), is(20));
    }

    @Ignore("Remove to run test")
    @Test
    public void testExample() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.pop(), is(20));

        subject.push(30);
        assertThat(subject.shift(), is(10));

        subject.unshift(40);
        subject.push(50);
        assertThat(subject.shift(), is(40));
        assertThat(subject.pop(), is(50));
        assertThat(subject.shift(), is(30));
    }
}
