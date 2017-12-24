package com.librarymap.pojo;

public class Book {
    private Integer id;

    private String title;

    private String author;

    private String bookid;

    private String shelfno;

    private String callno;

    private String typecode;

    private String tsm1;

    private String tsm2;

    private String tsm3;

    private String tsm4;

    private String tsm5;

    private String tsm6;

    private String tsm7;

    private String tsm8;

    private String createdate;

    private String modifydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    public String getShelfno() {
        return shelfno;
    }

    public void setShelfno(String shelfno) {
        this.shelfno = shelfno == null ? null : shelfno.trim();
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        this.callno = callno == null ? null : callno.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTsm1() {
        return tsm1;
    }

    public void setTsm1(String tsm1) {
        this.tsm1 = tsm1 == null ? null : tsm1.trim();
    }

    public String getTsm2() {
        return tsm2;
    }

    public void setTsm2(String tsm2) {
        this.tsm2 = tsm2 == null ? null : tsm2.trim();
    }

    public String getTsm3() {
        return tsm3;
    }

    public void setTsm3(String tsm3) {
        this.tsm3 = tsm3 == null ? null : tsm3.trim();
    }

    public String getTsm4() {
        return tsm4;
    }

    public void setTsm4(String tsm4) {
        this.tsm4 = tsm4 == null ? null : tsm4.trim();
    }

    public String getTsm5() {
        return tsm5;
    }

    public void setTsm5(String tsm5) {
        this.tsm5 = tsm5 == null ? null : tsm5.trim();
    }

    public String getTsm6() {
        return tsm6;
    }

    public void setTsm6(String tsm6) {
        this.tsm6 = tsm6 == null ? null : tsm6.trim();
    }

    public String getTsm7() {
        return tsm7;
    }

    public void setTsm7(String tsm7) {
        this.tsm7 = tsm7 == null ? null : tsm7.trim();
    }

    public String getTsm8() {
        return tsm8;
    }

    public void setTsm8(String tsm8) {
        this.tsm8 = tsm8 == null ? null : tsm8.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getModifydate() {
        return modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate == null ? null : modifydate.trim();
    }
}