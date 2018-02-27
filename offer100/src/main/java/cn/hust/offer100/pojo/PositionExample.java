package cn.hust.offer100.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIsNull() {
            addCriterion("position_category is null");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIsNotNull() {
            addCriterion("position_category is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryEqualTo(String value) {
            addCriterion("position_category =", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotEqualTo(String value) {
            addCriterion("position_category <>", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryGreaterThan(String value) {
            addCriterion("position_category >", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("position_category >=", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLessThan(String value) {
            addCriterion("position_category <", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLessThanOrEqualTo(String value) {
            addCriterion("position_category <=", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLike(String value) {
            addCriterion("position_category like", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotLike(String value) {
            addCriterion("position_category not like", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIn(List<String> values) {
            addCriterion("position_category in", values, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotIn(List<String> values) {
            addCriterion("position_category not in", values, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryBetween(String value1, String value2) {
            addCriterion("position_category between", value1, value2, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotBetween(String value1, String value2) {
            addCriterion("position_category not between", value1, value2, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionNumIsNull() {
            addCriterion("position_num is null");
            return (Criteria) this;
        }

        public Criteria andPositionNumIsNotNull() {
            addCriterion("position_num is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNumEqualTo(Integer value) {
            addCriterion("position_num =", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotEqualTo(Integer value) {
            addCriterion("position_num <>", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumGreaterThan(Integer value) {
            addCriterion("position_num >", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_num >=", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumLessThan(Integer value) {
            addCriterion("position_num <", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumLessThanOrEqualTo(Integer value) {
            addCriterion("position_num <=", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumIn(List<Integer> values) {
            addCriterion("position_num in", values, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotIn(List<Integer> values) {
            addCriterion("position_num not in", values, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumBetween(Integer value1, Integer value2) {
            addCriterion("position_num between", value1, value2, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("position_num not between", value1, value2, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNull() {
            addCriterion("position_address is null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNotNull() {
            addCriterion("position_address is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressEqualTo(String value) {
            addCriterion("position_address =", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotEqualTo(String value) {
            addCriterion("position_address <>", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThan(String value) {
            addCriterion("position_address >", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("position_address >=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThan(String value) {
            addCriterion("position_address <", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThanOrEqualTo(String value) {
            addCriterion("position_address <=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLike(String value) {
            addCriterion("position_address like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotLike(String value) {
            addCriterion("position_address not like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIn(List<String> values) {
            addCriterion("position_address in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotIn(List<String> values) {
            addCriterion("position_address not in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressBetween(String value1, String value2) {
            addCriterion("position_address between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotBetween(String value1, String value2) {
            addCriterion("position_address not between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNull() {
            addCriterion("position_city is null");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNotNull() {
            addCriterion("position_city is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCityEqualTo(String value) {
            addCriterion("position_city =", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotEqualTo(String value) {
            addCriterion("position_city <>", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThan(String value) {
            addCriterion("position_city >", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThanOrEqualTo(String value) {
            addCriterion("position_city >=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThan(String value) {
            addCriterion("position_city <", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThanOrEqualTo(String value) {
            addCriterion("position_city <=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLike(String value) {
            addCriterion("position_city like", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotLike(String value) {
            addCriterion("position_city not like", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityIn(List<String> values) {
            addCriterion("position_city in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotIn(List<String> values) {
            addCriterion("position_city not in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityBetween(String value1, String value2) {
            addCriterion("position_city between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotBetween(String value1, String value2) {
            addCriterion("position_city not between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationIsNull() {
            addCriterion("position_temptation is null");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationIsNotNull() {
            addCriterion("position_temptation is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationEqualTo(String value) {
            addCriterion("position_temptation =", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationNotEqualTo(String value) {
            addCriterion("position_temptation <>", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationGreaterThan(String value) {
            addCriterion("position_temptation >", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationGreaterThanOrEqualTo(String value) {
            addCriterion("position_temptation >=", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationLessThan(String value) {
            addCriterion("position_temptation <", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationLessThanOrEqualTo(String value) {
            addCriterion("position_temptation <=", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationLike(String value) {
            addCriterion("position_temptation like", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationNotLike(String value) {
            addCriterion("position_temptation not like", value, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationIn(List<String> values) {
            addCriterion("position_temptation in", values, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationNotIn(List<String> values) {
            addCriterion("position_temptation not in", values, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationBetween(String value1, String value2) {
            addCriterion("position_temptation between", value1, value2, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionTemptationNotBetween(String value1, String value2) {
            addCriterion("position_temptation not between", value1, value2, "positionTemptation");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsIsNull() {
            addCriterion("position_details is null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsIsNotNull() {
            addCriterion("position_details is not null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsEqualTo(String value) {
            addCriterion("position_details =", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsNotEqualTo(String value) {
            addCriterion("position_details <>", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsGreaterThan(String value) {
            addCriterion("position_details >", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("position_details >=", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsLessThan(String value) {
            addCriterion("position_details <", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsLessThanOrEqualTo(String value) {
            addCriterion("position_details <=", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsLike(String value) {
            addCriterion("position_details like", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsNotLike(String value) {
            addCriterion("position_details not like", value, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsIn(List<String> values) {
            addCriterion("position_details in", values, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsNotIn(List<String> values) {
            addCriterion("position_details not in", values, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsBetween(String value1, String value2) {
            addCriterion("position_details between", value1, value2, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionDetailsNotBetween(String value1, String value2) {
            addCriterion("position_details not between", value1, value2, "positionDetails");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageIsNull() {
            addCriterion("position_minwage is null");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageIsNotNull() {
            addCriterion("position_minwage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageEqualTo(Integer value) {
            addCriterion("position_minwage =", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageNotEqualTo(Integer value) {
            addCriterion("position_minwage <>", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageGreaterThan(Integer value) {
            addCriterion("position_minwage >", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_minwage >=", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageLessThan(Integer value) {
            addCriterion("position_minwage <", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageLessThanOrEqualTo(Integer value) {
            addCriterion("position_minwage <=", value, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageIn(List<Integer> values) {
            addCriterion("position_minwage in", values, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageNotIn(List<Integer> values) {
            addCriterion("position_minwage not in", values, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageBetween(Integer value1, Integer value2) {
            addCriterion("position_minwage between", value1, value2, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinwageNotBetween(Integer value1, Integer value2) {
            addCriterion("position_minwage not between", value1, value2, "positionMinwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageIsNull() {
            addCriterion("position_maxwage is null");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageIsNotNull() {
            addCriterion("position_maxwage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageEqualTo(Integer value) {
            addCriterion("position_maxwage =", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageNotEqualTo(Integer value) {
            addCriterion("position_maxwage <>", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageGreaterThan(Integer value) {
            addCriterion("position_maxwage >", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_maxwage >=", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageLessThan(Integer value) {
            addCriterion("position_maxwage <", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageLessThanOrEqualTo(Integer value) {
            addCriterion("position_maxwage <=", value, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageIn(List<Integer> values) {
            addCriterion("position_maxwage in", values, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageNotIn(List<Integer> values) {
            addCriterion("position_maxwage not in", values, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageBetween(Integer value1, Integer value2) {
            addCriterion("position_maxwage between", value1, value2, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMaxwageNotBetween(Integer value1, Integer value2) {
            addCriterion("position_maxwage not between", value1, value2, "positionMaxwage");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceIsNull() {
            addCriterion("position_minexperience is null");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceIsNotNull() {
            addCriterion("position_minexperience is not null");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceEqualTo(String value) {
            addCriterion("position_minexperience =", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceNotEqualTo(String value) {
            addCriterion("position_minexperience <>", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceGreaterThan(String value) {
            addCriterion("position_minexperience >", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("position_minexperience >=", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceLessThan(String value) {
            addCriterion("position_minexperience <", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceLessThanOrEqualTo(String value) {
            addCriterion("position_minexperience <=", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceLike(String value) {
            addCriterion("position_minexperience like", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceNotLike(String value) {
            addCriterion("position_minexperience not like", value, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceIn(List<String> values) {
            addCriterion("position_minexperience in", values, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceNotIn(List<String> values) {
            addCriterion("position_minexperience not in", values, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceBetween(String value1, String value2) {
            addCriterion("position_minexperience between", value1, value2, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMinexperienceNotBetween(String value1, String value2) {
            addCriterion("position_minexperience not between", value1, value2, "positionMinexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceIsNull() {
            addCriterion("position_maxexperience is null");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceIsNotNull() {
            addCriterion("position_maxexperience is not null");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceEqualTo(String value) {
            addCriterion("position_maxexperience =", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceNotEqualTo(String value) {
            addCriterion("position_maxexperience <>", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceGreaterThan(String value) {
            addCriterion("position_maxexperience >", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("position_maxexperience >=", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceLessThan(String value) {
            addCriterion("position_maxexperience <", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceLessThanOrEqualTo(String value) {
            addCriterion("position_maxexperience <=", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceLike(String value) {
            addCriterion("position_maxexperience like", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceNotLike(String value) {
            addCriterion("position_maxexperience not like", value, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceIn(List<String> values) {
            addCriterion("position_maxexperience in", values, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceNotIn(List<String> values) {
            addCriterion("position_maxexperience not in", values, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceBetween(String value1, String value2) {
            addCriterion("position_maxexperience between", value1, value2, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionMaxexperienceNotBetween(String value1, String value2) {
            addCriterion("position_maxexperience not between", value1, value2, "positionMaxexperience");
            return (Criteria) this;
        }

        public Criteria andPositionEducationIsNull() {
            addCriterion("position_education is null");
            return (Criteria) this;
        }

        public Criteria andPositionEducationIsNotNull() {
            addCriterion("position_education is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEducationEqualTo(String value) {
            addCriterion("position_education =", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationNotEqualTo(String value) {
            addCriterion("position_education <>", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationGreaterThan(String value) {
            addCriterion("position_education >", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationGreaterThanOrEqualTo(String value) {
            addCriterion("position_education >=", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationLessThan(String value) {
            addCriterion("position_education <", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationLessThanOrEqualTo(String value) {
            addCriterion("position_education <=", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationLike(String value) {
            addCriterion("position_education like", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationNotLike(String value) {
            addCriterion("position_education not like", value, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationIn(List<String> values) {
            addCriterion("position_education in", values, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationNotIn(List<String> values) {
            addCriterion("position_education not in", values, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationBetween(String value1, String value2) {
            addCriterion("position_education between", value1, value2, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionEducationNotBetween(String value1, String value2) {
            addCriterion("position_education not between", value1, value2, "positionEducation");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeIsNull() {
            addCriterion("position_creattime is null");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeIsNotNull() {
            addCriterion("position_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeEqualTo(Date value) {
            addCriterion("position_creattime =", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeNotEqualTo(Date value) {
            addCriterion("position_creattime <>", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeGreaterThan(Date value) {
            addCriterion("position_creattime >", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("position_creattime >=", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeLessThan(Date value) {
            addCriterion("position_creattime <", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("position_creattime <=", value, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeIn(List<Date> values) {
            addCriterion("position_creattime in", values, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeNotIn(List<Date> values) {
            addCriterion("position_creattime not in", values, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeBetween(Date value1, Date value2) {
            addCriterion("position_creattime between", value1, value2, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("position_creattime not between", value1, value2, "positionCreattime");
            return (Criteria) this;
        }

        public Criteria andPositionNatureIsNull() {
            addCriterion("position_nature is null");
            return (Criteria) this;
        }

        public Criteria andPositionNatureIsNotNull() {
            addCriterion("position_nature is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNatureEqualTo(String value) {
            addCriterion("position_nature =", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureNotEqualTo(String value) {
            addCriterion("position_nature <>", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureGreaterThan(String value) {
            addCriterion("position_nature >", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureGreaterThanOrEqualTo(String value) {
            addCriterion("position_nature >=", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureLessThan(String value) {
            addCriterion("position_nature <", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureLessThanOrEqualTo(String value) {
            addCriterion("position_nature <=", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureLike(String value) {
            addCriterion("position_nature like", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureNotLike(String value) {
            addCriterion("position_nature not like", value, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureIn(List<String> values) {
            addCriterion("position_nature in", values, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureNotIn(List<String> values) {
            addCriterion("position_nature not in", values, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureBetween(String value1, String value2) {
            addCriterion("position_nature between", value1, value2, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionNatureNotBetween(String value1, String value2) {
            addCriterion("position_nature not between", value1, value2, "positionNature");
            return (Criteria) this;
        }

        public Criteria andPositionLabelIsNull() {
            addCriterion("position_label is null");
            return (Criteria) this;
        }

        public Criteria andPositionLabelIsNotNull() {
            addCriterion("position_label is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLabelEqualTo(String value) {
            addCriterion("position_label =", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelNotEqualTo(String value) {
            addCriterion("position_label <>", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelGreaterThan(String value) {
            addCriterion("position_label >", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelGreaterThanOrEqualTo(String value) {
            addCriterion("position_label >=", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelLessThan(String value) {
            addCriterion("position_label <", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelLessThanOrEqualTo(String value) {
            addCriterion("position_label <=", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelLike(String value) {
            addCriterion("position_label like", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelNotLike(String value) {
            addCriterion("position_label not like", value, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelIn(List<String> values) {
            addCriterion("position_label in", values, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelNotIn(List<String> values) {
            addCriterion("position_label not in", values, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelBetween(String value1, String value2) {
            addCriterion("position_label between", value1, value2, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionLabelNotBetween(String value1, String value2) {
            addCriterion("position_label not between", value1, value2, "positionLabel");
            return (Criteria) this;
        }

        public Criteria andPositionStatusIsNull() {
            addCriterion("position_status is null");
            return (Criteria) this;
        }

        public Criteria andPositionStatusIsNotNull() {
            addCriterion("position_status is not null");
            return (Criteria) this;
        }

        public Criteria andPositionStatusEqualTo(String value) {
            addCriterion("position_status =", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusNotEqualTo(String value) {
            addCriterion("position_status <>", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusGreaterThan(String value) {
            addCriterion("position_status >", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("position_status >=", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusLessThan(String value) {
            addCriterion("position_status <", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusLessThanOrEqualTo(String value) {
            addCriterion("position_status <=", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusLike(String value) {
            addCriterion("position_status like", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusNotLike(String value) {
            addCriterion("position_status not like", value, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusIn(List<String> values) {
            addCriterion("position_status in", values, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusNotIn(List<String> values) {
            addCriterion("position_status not in", values, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusBetween(String value1, String value2) {
            addCriterion("position_status between", value1, value2, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionStatusNotBetween(String value1, String value2) {
            addCriterion("position_status not between", value1, value2, "positionStatus");
            return (Criteria) this;
        }

        public Criteria andPositionReasonIsNull() {
            addCriterion("position_reason is null");
            return (Criteria) this;
        }

        public Criteria andPositionReasonIsNotNull() {
            addCriterion("position_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPositionReasonEqualTo(String value) {
            addCriterion("position_reason =", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonNotEqualTo(String value) {
            addCriterion("position_reason <>", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonGreaterThan(String value) {
            addCriterion("position_reason >", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonGreaterThanOrEqualTo(String value) {
            addCriterion("position_reason >=", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonLessThan(String value) {
            addCriterion("position_reason <", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonLessThanOrEqualTo(String value) {
            addCriterion("position_reason <=", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonLike(String value) {
            addCriterion("position_reason like", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonNotLike(String value) {
            addCriterion("position_reason not like", value, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonIn(List<String> values) {
            addCriterion("position_reason in", values, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonNotIn(List<String> values) {
            addCriterion("position_reason not in", values, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonBetween(String value1, String value2) {
            addCriterion("position_reason between", value1, value2, "positionReason");
            return (Criteria) this;
        }

        public Criteria andPositionReasonNotBetween(String value1, String value2) {
            addCriterion("position_reason not between", value1, value2, "positionReason");
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