package com.example.entity;

import java.util.*;

/**
 * 类描述
 *
 * @author ZS
 * @date 2015年7月21日 上午9:48:53
 */
public class User {
    private String username;
    private String plainPassword;
    private String encryptedPassword;
    private String name;
    private String realName;
    private String sno;
    private String email;
    private String modificationDate;
    private String mobile;
    private int bindingMobile;
    private int bindingEmail;
    private String avatar;
    private String artwork;
    private int gender;
    private Date birthday;
    private String signature;
    private String country;
    private String province;
    private String city;
    private String district;
    private String platform;
    private String device;
    private String appleToken;
    private boolean isEffective;
    private String creationDate;
    private int sl;// 用户密级 0： 普通，7：公测用户，8：内测用户，9：预研用户
    private String cardID;// 校园卡卡号
    private String bindingCode;// 班级通绑定码
    private String sn;// 机器码

    private String plainbingdingCode;// 没有加密的绑定码

    private Integer role;//1:老师，2，家长
    private Integer phase;//学段
    private Integer subject;//学科
    private Integer isComplete;//是否完成
    private String tags;//用户标签
    private Integer title;//职务
    private Integer unitID;//单位编号
    private String workUnit;//工作单位

    private Integer effectValue;//影响力

    private List<Map<String, Object>> eduTopicLabels;//用户关联标签
    private String eduTopicLabelsStr;//用户关联标签json字符串


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the plainPassword
     */
    public String getPlainPassword() {
        return plainPassword;
    }

    /**
     * @param plainPassword the plainPassword to set
     */
    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }

    /**
     * @return the encryptedPassword
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * @param encryptedPassword the encryptedPassword to set
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the modificationDate
     */
    public String getModificationDate() {
        return modificationDate;
    }

    /**
     * @param modificationDate the modificationDate to set
     */
    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the bindingMobile
     */
    public int getBindingMobile() {
        return bindingMobile;
    }

    /**
     * @param bindingMobile the bindingMobile to set
     */
    public void setBindingMobile(int bindingMobile) {
        this.bindingMobile = bindingMobile;
    }

    /**
     * @return the bindingEmail
     */
    public int getBindingEmail() {
        return bindingEmail;
    }

    /**
     * @param bindingEmail the bindingEmail to set
     */
    public void setBindingEmail(int bindingEmail) {
        this.bindingEmail = bindingEmail;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature the signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return the isEffective
     */
    public boolean getIsEffective() {
        return isEffective;
    }

    /**
     * @param isEffective the isEffective to set
     */
    public void setIsEffective(boolean isEffective) {
        this.isEffective = isEffective;
    }

    /**
     * @return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getAppleToken() {
        return appleToken;
    }

    public void setAppleToken(String appleToken) {
        this.appleToken = appleToken;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getBindingCode() {
        return bindingCode;
    }

    public void setBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
    }

    public String getPlainbingdingCode() {
        return plainbingdingCode;
    }

    public void setPlainbingdingCode(String plainbingdingCode) {
        this.plainbingdingCode = plainbingdingCode;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public List<Map<String, Object>> getEduTopicLabels() {
        return eduTopicLabels;
    }

    public void setEduTopicLabels(List<Map<String, Object>> eduTopicLabels) {
        this.eduTopicLabels = eduTopicLabels;
    }

    public void setEffective(boolean isEffective) {
        this.isEffective = isEffective;
    }

    public String getEduTopicLabelsStr() {
        return eduTopicLabelsStr;
    }

    public void setEduTopicLabelsStr(String eduTopicLabelsStr) {
        this.eduTopicLabelsStr = eduTopicLabelsStr;
    }

    public Integer getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(Integer effectValue) {
        this.effectValue = effectValue;
    }

    @Override
    public int hashCode() {
        return this.username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.username.equals(user.getUsername())) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", plainPassword='" + plainPassword + '\'' +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                ", name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", sno='" + sno + '\'' +
                ", email='" + email + '\'' +
                ", modificationDate='" + modificationDate + '\'' +
                ", mobile='" + mobile + '\'' +
                ", bindingMobile=" + bindingMobile +
                ", bindingEmail=" + bindingEmail +
                ", avatar='" + avatar + '\'' +
                ", artwork='" + artwork + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", signature='" + signature + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", platform='" + platform + '\'' +
                ", device='" + device + '\'' +
                ", appleToken='" + appleToken + '\'' +
                ", isEffective=" + isEffective +
                ", creationDate='" + creationDate + '\'' +
                ", sl=" + sl +
                ", cardID='" + cardID + '\'' +
                ", bindingCode='" + bindingCode + '\'' +
                ", sn='" + sn + '\'' +
                ", plainbingdingCode='" + plainbingdingCode + '\'' +
                ", role=" + role +
                ", phase=" + phase +
                ", subject=" + subject +
                ", isComplete=" + isComplete +
                ", tags='" + tags + '\'' +
                ", title=" + title +
                ", unitID=" + unitID +
                ", workUnit='" + workUnit + '\'' +
                ", effectValue=" + effectValue +
                ", eduTopicLabels=" + eduTopicLabels +
                ", eduTopicLabelsStr='" + eduTopicLabelsStr + '\'' +
                '}';
    }
}
