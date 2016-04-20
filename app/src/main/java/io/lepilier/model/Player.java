package io.lepilier.model;

/**
 * Created by Brendan on 16/04/2016.
 */
public class Player {
    // Fields
    private int idPlayer;
    private String namePlayer;
    private String sexePlayer;

    public Player(int idPlayer, String namePlayer, String sexePlayer) {
        this.idPlayer = idPlayer;
        this.namePlayer = namePlayer;
        this.sexePlayer = sexePlayer;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getSexePlayer() {
        return sexePlayer;
    }

    public void setSexePlayer(String sexePlayer) {
        this.sexePlayer = sexePlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + idPlayer +
                ", name='" + namePlayer + '\'' +
                ", sexe='" + sexePlayer + '\'' +
                '}';
    }
}
