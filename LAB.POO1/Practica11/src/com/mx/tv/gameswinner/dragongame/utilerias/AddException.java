package com.mx.tv.gameswinner.dragongame.utilerias;
public class AddException extends Exception {
  private int num;
    public AddException(String message, int num){
      super(message);
      this.num = num;
    }
    public int getNum() {
    	return num;
    }
}
