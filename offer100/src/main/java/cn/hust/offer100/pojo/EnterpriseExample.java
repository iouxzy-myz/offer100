package cn.hust.offer100.pojo;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlIsNull() {
            addCriterion("enterprise_logourl is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlIsNotNull() {
            addCriterion("enterprise_logourl is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlEqualTo(String value) {
            addCriterion("enterprise_logourl =", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlNotEqualTo(String value) {
            addCriterion("enterprise_logourl <>", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlGreaterThan(String value) {
            addCriterion("enterprise_logourl >", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_logourl >=", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlLessThan(String value) {
            addCriterion("enterprise_logourl <", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlLessThanOrEqualTo(String value) {
            addCriterion("enterprise_logourl <=", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlLike(String value) {
            addCriterion("enterprise_logourl like", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlNotLike(String value) {
            addCriterion("enterprise_logourl not like", value, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlIn(List<String> values) {
            addCriterion("enterprise_logourl in", values, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlNotIn(List<String> values) {
            addCriterion("enterprise_logourl not in", values, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlBetween(String value1, String value2) {
            addCriterion("enterprise_logourl between", value1, value2, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogourlNotBetween(String value1, String value2) {
            addCriterion("enterprise_logourl not between", value1, value2, "enterpriseLogourl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteIsNull() {
            addCriterion("enterprise_website is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteIsNotNull() {
            addCriterion("enterprise_website is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteEqualTo(String value) {
            addCriterion("enterprise_website =", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteNotEqualTo(String value) {
            addCriterion("enterprise_website <>", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteGreaterThan(String value) {
            addCriterion("enterprise_website >", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_website >=", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteLessThan(String value) {
            addCriterion("enterprise_website <", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteLessThanOrEqualTo(String value) {
            addCriterion("enterprise_website <=", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteLike(String value) {
            addCriterion("enterprise_website like", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteNotLike(String value) {
            addCriterion("enterprise_website not like", value, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteIn(List<String> values) {
            addCriterion("enterprise_website in", values, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteNotIn(List<String> values) {
            addCriterion("enterprise_website not in", values, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteBetween(String value1, String value2) {
            addCriterion("enterprise_website between", value1, value2, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterpriseWebsiteNotBetween(String value1, String value2) {
            addCriterion("enterprise_website not between", value1, value2, "enterpriseWebsite");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNull() {
            addCriterion("enterprise_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNotNull() {
            addCriterion("enterprise_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneEqualTo(String value) {
            addCriterion("enterprise_phone =", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotEqualTo(String value) {
            addCriterion("enterprise_phone <>", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThan(String value) {
            addCriterion("enterprise_phone >", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_phone >=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThan(String value) {
            addCriterion("enterprise_phone <", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanOrEqualTo(String value) {
            addCriterion("enterprise_phone <=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLike(String value) {
            addCriterion("enterprise_phone like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotLike(String value) {
            addCriterion("enterprise_phone not like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIn(List<String> values) {
            addCriterion("enterprise_phone in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotIn(List<String> values) {
            addCriterion("enterprise_phone not in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneBetween(String value1, String value2) {
            addCriterion("enterprise_phone between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotBetween(String value1, String value2) {
            addCriterion("enterprise_phone not between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNull() {
            addCriterion("enterprise_email is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNotNull() {
            addCriterion("enterprise_email is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailEqualTo(String value) {
            addCriterion("enterprise_email =", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotEqualTo(String value) {
            addCriterion("enterprise_email <>", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThan(String value) {
            addCriterion("enterprise_email >", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_email >=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThan(String value) {
            addCriterion("enterprise_email <", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThanOrEqualTo(String value) {
            addCriterion("enterprise_email <=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLike(String value) {
            addCriterion("enterprise_email like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotLike(String value) {
            addCriterion("enterprise_email not like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIn(List<String> values) {
            addCriterion("enterprise_email in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotIn(List<String> values) {
            addCriterion("enterprise_email not in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailBetween(String value1, String value2) {
            addCriterion("enterprise_email between", value1, value2, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotBetween(String value1, String value2) {
            addCriterion("enterprise_email not between", value1, value2, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIsNull() {
            addCriterion("enterprise_city is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIsNotNull() {
            addCriterion("enterprise_city is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityEqualTo(String value) {
            addCriterion("enterprise_city =", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityNotEqualTo(String value) {
            addCriterion("enterprise_city <>", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityGreaterThan(String value) {
            addCriterion("enterprise_city >", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_city >=", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityLessThan(String value) {
            addCriterion("enterprise_city <", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityLessThanOrEqualTo(String value) {
            addCriterion("enterprise_city <=", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityLike(String value) {
            addCriterion("enterprise_city like", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityNotLike(String value) {
            addCriterion("enterprise_city not like", value, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityIn(List<String> values) {
            addCriterion("enterprise_city in", values, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityNotIn(List<String> values) {
            addCriterion("enterprise_city not in", values, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityBetween(String value1, String value2) {
            addCriterion("enterprise_city between", value1, value2, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCityNotBetween(String value1, String value2) {
            addCriterion("enterprise_city not between", value1, value2, "enterpriseCity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorIsNull() {
            addCriterion("enterprise_sector is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorIsNotNull() {
            addCriterion("enterprise_sector is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorEqualTo(String value) {
            addCriterion("enterprise_sector =", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorNotEqualTo(String value) {
            addCriterion("enterprise_sector <>", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorGreaterThan(String value) {
            addCriterion("enterprise_sector >", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_sector >=", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorLessThan(String value) {
            addCriterion("enterprise_sector <", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorLessThanOrEqualTo(String value) {
            addCriterion("enterprise_sector <=", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorLike(String value) {
            addCriterion("enterprise_sector like", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorNotLike(String value) {
            addCriterion("enterprise_sector not like", value, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorIn(List<String> values) {
            addCriterion("enterprise_sector in", values, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorNotIn(List<String> values) {
            addCriterion("enterprise_sector not in", values, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorBetween(String value1, String value2) {
            addCriterion("enterprise_sector between", value1, value2, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseSectorNotBetween(String value1, String value2) {
            addCriterion("enterprise_sector not between", value1, value2, "enterpriseSector");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNull() {
            addCriterion("enterprise_scale is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIsNotNull() {
            addCriterion("enterprise_scale is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleEqualTo(String value) {
            addCriterion("enterprise_scale =", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotEqualTo(String value) {
            addCriterion("enterprise_scale <>", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThan(String value) {
            addCriterion("enterprise_scale >", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_scale >=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThan(String value) {
            addCriterion("enterprise_scale <", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLessThanOrEqualTo(String value) {
            addCriterion("enterprise_scale <=", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleLike(String value) {
            addCriterion("enterprise_scale like", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotLike(String value) {
            addCriterion("enterprise_scale not like", value, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleIn(List<String> values) {
            addCriterion("enterprise_scale in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotIn(List<String> values) {
            addCriterion("enterprise_scale not in", values, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleBetween(String value1, String value2) {
            addCriterion("enterprise_scale between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseScaleNotBetween(String value1, String value2) {
            addCriterion("enterprise_scale not between", value1, value2, "enterpriseScale");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIsNull() {
            addCriterion("enterprise_profile is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIsNotNull() {
            addCriterion("enterprise_profile is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileEqualTo(String value) {
            addCriterion("enterprise_profile =", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotEqualTo(String value) {
            addCriterion("enterprise_profile <>", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThan(String value) {
            addCriterion("enterprise_profile >", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_profile >=", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThan(String value) {
            addCriterion("enterprise_profile <", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThanOrEqualTo(String value) {
            addCriterion("enterprise_profile <=", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLike(String value) {
            addCriterion("enterprise_profile like", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotLike(String value) {
            addCriterion("enterprise_profile not like", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIn(List<String> values) {
            addCriterion("enterprise_profile in", values, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotIn(List<String> values) {
            addCriterion("enterprise_profile not in", values, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileBetween(String value1, String value2) {
            addCriterion("enterprise_profile between", value1, value2, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotBetween(String value1, String value2) {
            addCriterion("enterprise_profile not between", value1, value2, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsIsNull() {
            addCriterion("enterprise_details is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsIsNotNull() {
            addCriterion("enterprise_details is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsEqualTo(String value) {
            addCriterion("enterprise_details =", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsNotEqualTo(String value) {
            addCriterion("enterprise_details <>", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsGreaterThan(String value) {
            addCriterion("enterprise_details >", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_details >=", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsLessThan(String value) {
            addCriterion("enterprise_details <", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsLessThanOrEqualTo(String value) {
            addCriterion("enterprise_details <=", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsLike(String value) {
            addCriterion("enterprise_details like", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsNotLike(String value) {
            addCriterion("enterprise_details not like", value, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsIn(List<String> values) {
            addCriterion("enterprise_details in", values, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsNotIn(List<String> values) {
            addCriterion("enterprise_details not in", values, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsBetween(String value1, String value2) {
            addCriterion("enterprise_details between", value1, value2, "enterpriseDetails");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDetailsNotBetween(String value1, String value2) {
            addCriterion("enterprise_details not between", value1, value2, "enterpriseDetails");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}