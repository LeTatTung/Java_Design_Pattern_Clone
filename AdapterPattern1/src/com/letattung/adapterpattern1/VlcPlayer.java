package com.letattung.adapterpattern1;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file.Name: " +fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}

}
