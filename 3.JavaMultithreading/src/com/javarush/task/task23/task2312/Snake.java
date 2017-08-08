package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 009 09.07.17.
 */
public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;


    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(List<SnakeSection> sections, boolean isAlive, SnakeDirection direction) {
        this.sections = sections;
        this.isAlive = isAlive;
        this.direction = direction;
    }

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;

    }

    public Snake() {
    }

    ;

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move(){
        if (isAlive){
            if (direction==SnakeDirection.UP){
                move(0,-1);
            } else if (direction==SnakeDirection.RIGHT){
                move(1,0);
            } else if (direction==SnakeDirection.DOWN){
                move(0,1);
            } else if (direction==SnakeDirection.LEFT){
                move(-1,0);
            }
        }
    }
    public void move(int x, int y){

    }
    public void checkBorders (SnakeSection head){
        int headX = head.getX();
        int headY = head.getY();
        int widthRoom = Room.game.getWidth();
        int heightRoom = Room.game.getHeight();

        if (headX<0 || headX>=widthRoom || headY<0 || headY>=heightRoom){
            isAlive = false;
        }
        System.out.println(isAlive);
    }
    public void checkBody(SnakeSection head){
        if (sections.contains(head)){
            isAlive=false;
        }
    }

  /*  public Snake (int x, int y){
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x,y));
        isAlive = true;

    }*/
}
