package com.csc;

public class Node<T> {
  private final T data;

  private Node<T> left;
  private Node<T> right;
  private Node<T> parent;

  public Node(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
    this.parent = null;
  }

  public void setLeft(Node<T> child) {
    this.left = child;
    child.parent = this;
  }

  public void setRight(Node<T> child) {
    this.right = child;
    child.parent = this;
  }

  public Node<T> getParent() {
    return this.parent;
  }

  public Node<T> left() {
    return this.left;
  }

  public Node<T> right() {
    return this.right;
  }

  public T getElement() {
    return this.data;
  }
}
