package collection;

import character.Hero;

import java.util.LinkedList;

public class MyStack implements Stack {
    LinkedList<Hero>heroes = new LinkedList<Hero>();
    @Override
    public void push(Hero h) {
        heroes.addLast(h);
    }

    @Override
    public Hero pull() {
        return heroes.removeLast();
    }

    @Override
    public Hero peek() {
        return heroes.getLast();
    }

    public static void main(String[] args) {
        MyStack heroStack = new MyStack();
        for (int i = 0;i<5;i++){
            Hero h = new Hero("hero name "+i);
            System.out.println("压入hero: "+h);
            heroStack.push(h);
        }
        for (int i = 0;i<5;i++){
            Hero h = heroStack.pull();
            System.out.println("弹出hero: "+h);
        }
    }
}
