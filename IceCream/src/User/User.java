package User;

import IceCream.IceCream;

import java.util.List;

public class User {

    private int userId;
    private String userName;
    private List<IceCream> favorites;

    public User(int userId, String userName, List<IceCream> favorites) {
        this.userId = userId;
        this.userName = userName;
        this.favorites = favorites;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<IceCream> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<IceCream> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", favorites=" + favorites +
                '}';
    }
}
