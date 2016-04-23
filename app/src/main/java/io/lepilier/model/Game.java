package io.lepilier.model;

import java.util.List;

/**
 * Created by Brendan on 23/04/2016.
 */
public class Game {
    private int levelGame;
    private List<Player> listPlayerGame;
    private List<Challenge> listChallengeGame;

    public Game(int levelGame, List<Player> listPlayerGame, List<Challenge> listChallengeGame) {
        this.levelGame = levelGame;
        this.listPlayerGame = listPlayerGame;
        this.listChallengeGame = listChallengeGame;
    }

    public int getLevelGame() {
        return levelGame;
    }

    public void setLevelGame(int levelGame) {
        this.levelGame = levelGame;
    }

    public List<Player> getListPlayerGame() {
        return listPlayerGame;
    }

    public void setListPlayerGame(List<Player> listPlayerGame) {
        this.listPlayerGame = listPlayerGame;
    }

    public List<Challenge> getListChallengeGame() {
        return listChallengeGame;
    }

    public void setListChallengeGame(List<Challenge> listChallengeGame) {
        this.listChallengeGame = listChallengeGame;
    }
}
