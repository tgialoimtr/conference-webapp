/***********************************************************************
 * Module:  User.java
 * Author:  DELL
 * Purpose: Defines the Class User
 ***********************************************************************/
package conference.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** @pdOid 5b345014-a49e-47f0-94b1-3fb6870e4220 */
@Entity
@Table(name = "user")
public class User {
   /** @pdOid 953e3869-d9fe-43f7-bc17-d7e62a6f7877 */
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "user_id")
   public int userId=0;

/** @pdOid 9aaffef5-533a-4f24-8bbc-63baa6ac3028 */
   public java.lang.String userName;
   /** @pdOid b9a766cc-f535-49c7-b055-95bacea36843 */
   public java.lang.String firstName;
   /** @pdOid 2c5d4447-3834-4876-8e72-3e611e98bd31 */
   public java.lang.String lastName;
   /** @pdOid 9baa5db5-5740-4914-8263-ab4bb036eb4c */
   public java.lang.String phoneNumber;
   /** @pdOid 9fbb649b-c9cb-42d4-bd27-357df2e5cca0 */
   public java.lang.String academicTitle;
   /** @pdOid c7e7df79-bfe6-4328-b049-4b344a0b01a1 */
   public java.lang.String address;
   /** @pdOid 06aed742-62b5-48b5-928e-c59ab204365f */
   public java.lang.String email;
   /** @pdOid 318b8406-38cb-4fd1-998a-c09f16c95424 */
   public java.lang.String password;
   /** @pdOid 1daa8292-0ad6-4ee9-8f35-ad694dd14c14 */
   public java.lang.String repassword;
   /** @pdOid 095195a1-c3ed-4fa2-9143-84424894307a */
   public java.lang.String organization;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public java.lang.String getUserName() {
	return userName;
}
public void setUserName(java.lang.String userName) {
	this.userName = userName;
}
public java.lang.String getFirstName() {
	return firstName;
}
public void setFirstName(java.lang.String firstName) {
	this.firstName = firstName;
}
public java.lang.String getLastName() {
	return lastName;
}
public void setLastName(java.lang.String lastName) {
	this.lastName = lastName;
}
public java.lang.String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(java.lang.String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public java.lang.String getAcademicTitle() {
	return academicTitle;
}
public void setAcademicTitle(java.lang.String academicTitle) {
	this.academicTitle = academicTitle;
}
public java.lang.String getAddress() {
	return address;
}
public void setAddress(java.lang.String address) {
	this.address = address;
}
public java.lang.String getEmail() {
	return email;
}
public void setEmail(java.lang.String email) {
	this.email = email;
}
public java.lang.String getPassword() {
	return password;
}
public void setPassword(java.lang.String password) {
	this.password = password;
}
public java.lang.String getRepassword() {
	return repassword;
}
public void setRepassword(java.lang.String repassword) {
	this.repassword = repassword;
}
public java.lang.String getOrganization() {
	return organization;
}
public void setOrganization(java.lang.String organization) {
	this.organization = organization;
}
   

}
