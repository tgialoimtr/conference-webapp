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
@Table(name = "submission")
public class Submission {
   /** @pdOid 953e3869-d9fe-43f7-bc17-d7e62a6f7877 */
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "submission_id")
   public int submissionId=0;

/** @pdOid 9aaffef5-533a-4f24-8bbc-63baa6ac3028 */
   public int userId;
   /** @pdOid b9a766cc-f535-49c7-b055-95bacea36843 */
   public java.lang.String title;
   /** @pdOid 2c5d4447-3834-4876-8e72-3e611e98bd31 */
   public java.lang.String authors;
   /** @pdOid 9baa5db5-5740-4914-8263-ab4bb036eb4c */
   public java.lang.String pdfFile;
   /** @pdOid 9fbb649b-c9cb-42d4-bd27-357df2e5cca0 */
   public java.lang.String texFile;
   /** @pdOid c7e7df79-bfe6-4328-b049-4b344a0b01a1 */
   @Column(name = "abstract")
   public java.lang.String abstract0;
   /** @pdOid 06aed742-62b5-48b5-928e-c59ab204365f */
   public java.lang.String keyword;
public int getSubmissionId() {
	return submissionId;
}
public void setSubmissionId(int submissionId) {
	this.submissionId = submissionId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public java.lang.String getTitle() {
	return title;
}
public void setTitle(java.lang.String title) {
	this.title = title;
}
public java.lang.String getAuthors() {
	return authors;
}
public void setAuthors(java.lang.String authors) {
	this.authors = authors;
}
public java.lang.String getPdfFile() {
	return pdfFile;
}
public void setPdfFile(java.lang.String pdfFile) {
	this.pdfFile = pdfFile;
}
public java.lang.String getTexFile() {
	return texFile;
}
public void setTexFile(java.lang.String texFile) {
	this.texFile = texFile;
}
public java.lang.String getAbstract0() {
	return abstract0;
}
public void setAbstract0(java.lang.String abstract_) {
	this.abstract0 = abstract_;
}
public java.lang.String getKeyword() {
	return keyword;
}
public void setKeyword(java.lang.String keyword) {
	this.keyword = keyword;
}
   

}
