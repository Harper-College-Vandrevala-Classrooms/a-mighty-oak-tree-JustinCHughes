package com.csc;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree<Squirrel> tree;
  Node<Squirrel> nodeOne;
  Node<Squirrel> nodeTwo;
  Node<Squirrel> nodeThree;

  @BeforeEach
  void setUp() {
    nodeOne = new Node<>(new Squirrel("Cheeks"));
    nodeTwo = new Node<>(new Squirrel("Squeaks"));
    nodeThree = new Node<>(new Squirrel("Mr. Fluffy Butt"));

    nodeOne.setLeft(nodeTwo);
    nodeOne.setRight(nodeThree);
    tree = new OakTree<>(nodeOne);
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testRoot() {
    assertEquals("Cheeks",tree.getRoot().getElement().getName());
  }

  @Test
  void testLeft() {
    assertEquals("Squeaks",tree.getRoot().left().getElement().getName());
  }

  @Test
  void testRight() {
    assertEquals("Mr. Fluffy Butt",tree.getRoot().right().getElement().getName());
  }

  @Test
  void testLeftParent() {
    assertEquals("Cheeks", nodeTwo.getParent().getElement().getName());
  }

  @Test
  void testRightParent() {
    assertEquals("Cheeks", nodeThree.getParent().getElement().getName());
  }

  @Test
  void testLeftLeftChild() {
    assertThrows(NullPointerException.class, () -> {
      nodeTwo.left().getElement().getName();
    });
  }

  @Test
  void testLeftRightChild() {
    assertThrows(NullPointerException.class, () -> {
      nodeTwo.right().getElement().getName();
    });
  }

  @Test
  void testRightLeftChild() {
    assertThrows(NullPointerException.class, () -> {
      nodeThree.left().getElement().getName();
    });
  }

  @Test
  void testRightRightChild() {
    assertThrows(NullPointerException.class, () -> {
      nodeThree.right().getElement().getName();
    });
  }
}
