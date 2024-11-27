package com.csc;

public class OakTree<T> {
  public static void main(String[] args) {
    // Create first binary search tree elements with squirrels
    Node<Squirrel> nodeOne = new Node<>(new Squirrel("Cheeks"));
    Node<Squirrel> nodeTwo = new Node<>(new Squirrel("Squeaks"));
    Node<Squirrel> nodeThree = new Node<>(new Squirrel("Mr. Fluffy Butt"));

    nodeOne.setLeft(nodeTwo);
    nodeOne.setRight(nodeThree);

    OakTree<Squirrel> squirrelTree = new OakTree<>(nodeOne);
    squirrelTree.getRoot().getElement().print();
    squirrelTree.getRoot().left().getElement().print();
    squirrelTree.getRoot().right().getElement().print();
    
    System.out.printf("\n\n");
    // Initialize nodes with the family data
    // Extra credit for 3 points - Nodes take generics
    // And below, Binary Tree takes generic node
    Node<Family> nodeMember1 = new Node<>(new Family("Amschel Rothschild", 1744, 1812));
    Node<Family> nodeMember2 = new Node<>(new Family("Nathan Rothschild", 1777, 1836));
    Node<Family> nodeMember3 = new Node<>(new Family("Carl von Rothschild", 1788, 1855));
    Node<Family> nodeMember4 = new Node<>(new Family("Lionel de Rothschild", 1806, 1879));
    Node<Family> nodeMember5 = new Node<>(new Family("Baronet Anothony de Rothschild", 1810, 1876));
    Node<Family> nodeMember6 = new Node<>(new Family("Mayer von Rothschild",1819, 1884));
    Node<Family> nodeMember7 = new Node<>(new Family("Adolf von Rothschild", 1823,1900));

    OakTree<Family> RothschildTree = new OakTree<>(nodeMember1);

    nodeMember1.setLeft(nodeMember2);
    nodeMember1.setRight(nodeMember3);
    nodeMember2.setLeft(nodeMember4);
    nodeMember2.setRight(nodeMember5);
    nodeMember3.setLeft(nodeMember6);
    nodeMember3.setRight(nodeMember7);

    RothschildTree.getRoot().getElement().print();
    RothschildTree.getRoot().left().getElement().print();
    RothschildTree.getRoot().right().getElement().print();
  }

  private Node<T> root;

  // Initialize with a Node holding the data
  public OakTree(Node<T> root) {
    this.root = root;    
  }
  
  // Set a new root for the tree
  public void setRoot(Node<T> newRoot) {
    this.root = newRoot;
  }

  // Get the root of the tree
  public Node<T> getRoot() {
    return this.root;
  }
}
