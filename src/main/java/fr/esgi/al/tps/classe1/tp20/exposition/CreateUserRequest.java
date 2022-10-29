package fr.esgi.al.tps.classe1.tp20.exposition;

//DTO
public final class CreateUserRequest {

    public final String username;
    public final String city;

    public CreateUserRequest(String username, String city) {
        this.username = username;
        this.city = city;
    }
}
