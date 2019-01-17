package com.yh.pojo;

public class User {

    private Long uid;

    private String name;

    private String account;

    private String password;

   private Character state;

    //表达多对多关系
//	private Set<Role> roles = new HashSet<Role>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    /*public Set<Role> getRoles() {
            return roles;
        }

        public void setRoles(Set<Role> roles) {
            this.roles = roles;
        }
    */
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}
