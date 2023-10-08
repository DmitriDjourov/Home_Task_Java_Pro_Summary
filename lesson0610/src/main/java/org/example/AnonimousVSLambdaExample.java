package org.example;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AnonimousVSLambdaExample {
		public static void main(String[] args) {
				Playable footballplayer = new Footballplayer();
				Playable bascetballPlayer = new BascetballPlayer();
				Playable bascetballPlayer2 = new BascetballPlayer();
				Playable bascetballPlayer3 = new BascetballPlayer();
				Playable chessPlayer = new Playable() {
						@Override
						public void play() {
								System.out.println("Playing chess");
						}
				};

new Playable(){
		@Override
		public void play(){
				System.out.println("Playing badminton");
		}

}.play();

Playable golfPlayer = () -> System.out.println("Play golf");

				((Playable)() -> System.out.println("Playing some game")).play();
				((Runnable)() -> System.out.println("Playing some game")).run();

		//void -> void --Supplier
				Consumer dartsPlayer = (x) -> System.out.println("Playing darts");
				// date -> void
				// data1 -> data2
				// data -> boolean
				// (data1,data2) -> data3

Playable cardsPlayer = () ->{
		int someData = 100;
		System.out.println("Play cards");
		System.out.println("Cool game" + someData);
};

//				footballplayer.play();
//				bascetballPlayer.play();

				playAll(new Playable() {
						@Override
						public void play() {
								System.out.println("Play some game");
						}
				});

				playAll(footballplayer,
						bascetballPlayer,
						bascetballPlayer2,
						bascetballPlayer3,
						chessPlayer,
						golfPlayer
						);
		}

		private static void playAll(Playable... players) {
		for (Playable p : players ){
				p.play();

	}
		}
}