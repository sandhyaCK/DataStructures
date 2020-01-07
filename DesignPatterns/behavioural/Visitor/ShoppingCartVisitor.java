package com.bridgelabz.behavioural;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
