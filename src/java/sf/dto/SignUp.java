package sf.dto;


public class SignUp 
{
    private String userId;
    private String userName;
    private long contact;
    private String mailId;
    private String address;
    private String pickup;
    private String drop;
    private String startdate;
    private String pickuptime;
    private String gender;

    
    public SignUp() {
    }

    
    public SignUp(String userId, String userName, long contact, String mailId, String address, String pickup, String drop, String startdate, String pickuptime, String gender) {
        this.userId = userId;
        this.userName = userName;
        this.contact = contact;
        this.mailId = mailId;
        this.address = address;
        this.pickup = pickup;
        this.drop = drop;
        this.startdate = startdate;
        this.pickuptime = pickuptime;
        this.gender = gender;
    }
    
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
