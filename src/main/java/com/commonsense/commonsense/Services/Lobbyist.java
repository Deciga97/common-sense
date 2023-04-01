package com.commonsense.commonsense.Services;

import java.util.List;

public interface Lobbyist {
    Lobbyist createLobbyist(Lobbyist lobbyist);
    Lobbyist updateLobbyist(Long id, Lobbyist lobbyist);
    void deleteLobbyist(Long id);
    Lobbyist getLobbyistById(Long id);
    List<Lobbyist> getAllLobbyists();

}
