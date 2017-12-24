package com.librarymap.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(String value) {
            addCriterion("bookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(String value) {
            addCriterion("bookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(String value) {
            addCriterion("bookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(String value) {
            addCriterion("bookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(String value) {
            addCriterion("bookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(String value) {
            addCriterion("bookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLike(String value) {
            addCriterion("bookId like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotLike(String value) {
            addCriterion("bookId not like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<String> values) {
            addCriterion("bookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<String> values) {
            addCriterion("bookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(String value1, String value2) {
            addCriterion("bookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(String value1, String value2) {
            addCriterion("bookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andShelfnoIsNull() {
            addCriterion("shelfno is null");
            return (Criteria) this;
        }

        public Criteria andShelfnoIsNotNull() {
            addCriterion("shelfno is not null");
            return (Criteria) this;
        }

        public Criteria andShelfnoEqualTo(String value) {
            addCriterion("shelfno =", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotEqualTo(String value) {
            addCriterion("shelfno <>", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoGreaterThan(String value) {
            addCriterion("shelfno >", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoGreaterThanOrEqualTo(String value) {
            addCriterion("shelfno >=", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoLessThan(String value) {
            addCriterion("shelfno <", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoLessThanOrEqualTo(String value) {
            addCriterion("shelfno <=", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoLike(String value) {
            addCriterion("shelfno like", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotLike(String value) {
            addCriterion("shelfno not like", value, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoIn(List<String> values) {
            addCriterion("shelfno in", values, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotIn(List<String> values) {
            addCriterion("shelfno not in", values, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoBetween(String value1, String value2) {
            addCriterion("shelfno between", value1, value2, "shelfno");
            return (Criteria) this;
        }

        public Criteria andShelfnoNotBetween(String value1, String value2) {
            addCriterion("shelfno not between", value1, value2, "shelfno");
            return (Criteria) this;
        }

        public Criteria andCallnoIsNull() {
            addCriterion("callno is null");
            return (Criteria) this;
        }

        public Criteria andCallnoIsNotNull() {
            addCriterion("callno is not null");
            return (Criteria) this;
        }

        public Criteria andCallnoEqualTo(String value) {
            addCriterion("callno =", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotEqualTo(String value) {
            addCriterion("callno <>", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThan(String value) {
            addCriterion("callno >", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoGreaterThanOrEqualTo(String value) {
            addCriterion("callno >=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThan(String value) {
            addCriterion("callno <", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLessThanOrEqualTo(String value) {
            addCriterion("callno <=", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoLike(String value) {
            addCriterion("callno like", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotLike(String value) {
            addCriterion("callno not like", value, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoIn(List<String> values) {
            addCriterion("callno in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotIn(List<String> values) {
            addCriterion("callno not in", values, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoBetween(String value1, String value2) {
            addCriterion("callno between", value1, value2, "callno");
            return (Criteria) this;
        }

        public Criteria andCallnoNotBetween(String value1, String value2) {
            addCriterion("callno not between", value1, value2, "callno");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("typeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typeCode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typeCode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTsm1IsNull() {
            addCriterion("tsm1 is null");
            return (Criteria) this;
        }

        public Criteria andTsm1IsNotNull() {
            addCriterion("tsm1 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm1EqualTo(String value) {
            addCriterion("tsm1 =", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1NotEqualTo(String value) {
            addCriterion("tsm1 <>", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1GreaterThan(String value) {
            addCriterion("tsm1 >", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1GreaterThanOrEqualTo(String value) {
            addCriterion("tsm1 >=", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1LessThan(String value) {
            addCriterion("tsm1 <", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1LessThanOrEqualTo(String value) {
            addCriterion("tsm1 <=", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1Like(String value) {
            addCriterion("tsm1 like", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1NotLike(String value) {
            addCriterion("tsm1 not like", value, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1In(List<String> values) {
            addCriterion("tsm1 in", values, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1NotIn(List<String> values) {
            addCriterion("tsm1 not in", values, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1Between(String value1, String value2) {
            addCriterion("tsm1 between", value1, value2, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm1NotBetween(String value1, String value2) {
            addCriterion("tsm1 not between", value1, value2, "tsm1");
            return (Criteria) this;
        }

        public Criteria andTsm2IsNull() {
            addCriterion("tsm2 is null");
            return (Criteria) this;
        }

        public Criteria andTsm2IsNotNull() {
            addCriterion("tsm2 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm2EqualTo(String value) {
            addCriterion("tsm2 =", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2NotEqualTo(String value) {
            addCriterion("tsm2 <>", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2GreaterThan(String value) {
            addCriterion("tsm2 >", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2GreaterThanOrEqualTo(String value) {
            addCriterion("tsm2 >=", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2LessThan(String value) {
            addCriterion("tsm2 <", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2LessThanOrEqualTo(String value) {
            addCriterion("tsm2 <=", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2Like(String value) {
            addCriterion("tsm2 like", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2NotLike(String value) {
            addCriterion("tsm2 not like", value, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2In(List<String> values) {
            addCriterion("tsm2 in", values, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2NotIn(List<String> values) {
            addCriterion("tsm2 not in", values, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2Between(String value1, String value2) {
            addCriterion("tsm2 between", value1, value2, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm2NotBetween(String value1, String value2) {
            addCriterion("tsm2 not between", value1, value2, "tsm2");
            return (Criteria) this;
        }

        public Criteria andTsm3IsNull() {
            addCriterion("tsm3 is null");
            return (Criteria) this;
        }

        public Criteria andTsm3IsNotNull() {
            addCriterion("tsm3 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm3EqualTo(String value) {
            addCriterion("tsm3 =", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3NotEqualTo(String value) {
            addCriterion("tsm3 <>", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3GreaterThan(String value) {
            addCriterion("tsm3 >", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3GreaterThanOrEqualTo(String value) {
            addCriterion("tsm3 >=", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3LessThan(String value) {
            addCriterion("tsm3 <", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3LessThanOrEqualTo(String value) {
            addCriterion("tsm3 <=", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3Like(String value) {
            addCriterion("tsm3 like", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3NotLike(String value) {
            addCriterion("tsm3 not like", value, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3In(List<String> values) {
            addCriterion("tsm3 in", values, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3NotIn(List<String> values) {
            addCriterion("tsm3 not in", values, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3Between(String value1, String value2) {
            addCriterion("tsm3 between", value1, value2, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm3NotBetween(String value1, String value2) {
            addCriterion("tsm3 not between", value1, value2, "tsm3");
            return (Criteria) this;
        }

        public Criteria andTsm4IsNull() {
            addCriterion("tsm4 is null");
            return (Criteria) this;
        }

        public Criteria andTsm4IsNotNull() {
            addCriterion("tsm4 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm4EqualTo(String value) {
            addCriterion("tsm4 =", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4NotEqualTo(String value) {
            addCriterion("tsm4 <>", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4GreaterThan(String value) {
            addCriterion("tsm4 >", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4GreaterThanOrEqualTo(String value) {
            addCriterion("tsm4 >=", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4LessThan(String value) {
            addCriterion("tsm4 <", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4LessThanOrEqualTo(String value) {
            addCriterion("tsm4 <=", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4Like(String value) {
            addCriterion("tsm4 like", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4NotLike(String value) {
            addCriterion("tsm4 not like", value, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4In(List<String> values) {
            addCriterion("tsm4 in", values, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4NotIn(List<String> values) {
            addCriterion("tsm4 not in", values, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4Between(String value1, String value2) {
            addCriterion("tsm4 between", value1, value2, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm4NotBetween(String value1, String value2) {
            addCriterion("tsm4 not between", value1, value2, "tsm4");
            return (Criteria) this;
        }

        public Criteria andTsm5IsNull() {
            addCriterion("tsm5 is null");
            return (Criteria) this;
        }

        public Criteria andTsm5IsNotNull() {
            addCriterion("tsm5 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm5EqualTo(String value) {
            addCriterion("tsm5 =", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5NotEqualTo(String value) {
            addCriterion("tsm5 <>", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5GreaterThan(String value) {
            addCriterion("tsm5 >", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5GreaterThanOrEqualTo(String value) {
            addCriterion("tsm5 >=", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5LessThan(String value) {
            addCriterion("tsm5 <", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5LessThanOrEqualTo(String value) {
            addCriterion("tsm5 <=", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5Like(String value) {
            addCriterion("tsm5 like", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5NotLike(String value) {
            addCriterion("tsm5 not like", value, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5In(List<String> values) {
            addCriterion("tsm5 in", values, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5NotIn(List<String> values) {
            addCriterion("tsm5 not in", values, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5Between(String value1, String value2) {
            addCriterion("tsm5 between", value1, value2, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm5NotBetween(String value1, String value2) {
            addCriterion("tsm5 not between", value1, value2, "tsm5");
            return (Criteria) this;
        }

        public Criteria andTsm6IsNull() {
            addCriterion("tsm6 is null");
            return (Criteria) this;
        }

        public Criteria andTsm6IsNotNull() {
            addCriterion("tsm6 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm6EqualTo(String value) {
            addCriterion("tsm6 =", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6NotEqualTo(String value) {
            addCriterion("tsm6 <>", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6GreaterThan(String value) {
            addCriterion("tsm6 >", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6GreaterThanOrEqualTo(String value) {
            addCriterion("tsm6 >=", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6LessThan(String value) {
            addCriterion("tsm6 <", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6LessThanOrEqualTo(String value) {
            addCriterion("tsm6 <=", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6Like(String value) {
            addCriterion("tsm6 like", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6NotLike(String value) {
            addCriterion("tsm6 not like", value, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6In(List<String> values) {
            addCriterion("tsm6 in", values, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6NotIn(List<String> values) {
            addCriterion("tsm6 not in", values, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6Between(String value1, String value2) {
            addCriterion("tsm6 between", value1, value2, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm6NotBetween(String value1, String value2) {
            addCriterion("tsm6 not between", value1, value2, "tsm6");
            return (Criteria) this;
        }

        public Criteria andTsm7IsNull() {
            addCriterion("tsm7 is null");
            return (Criteria) this;
        }

        public Criteria andTsm7IsNotNull() {
            addCriterion("tsm7 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm7EqualTo(String value) {
            addCriterion("tsm7 =", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7NotEqualTo(String value) {
            addCriterion("tsm7 <>", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7GreaterThan(String value) {
            addCriterion("tsm7 >", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7GreaterThanOrEqualTo(String value) {
            addCriterion("tsm7 >=", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7LessThan(String value) {
            addCriterion("tsm7 <", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7LessThanOrEqualTo(String value) {
            addCriterion("tsm7 <=", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7Like(String value) {
            addCriterion("tsm7 like", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7NotLike(String value) {
            addCriterion("tsm7 not like", value, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7In(List<String> values) {
            addCriterion("tsm7 in", values, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7NotIn(List<String> values) {
            addCriterion("tsm7 not in", values, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7Between(String value1, String value2) {
            addCriterion("tsm7 between", value1, value2, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm7NotBetween(String value1, String value2) {
            addCriterion("tsm7 not between", value1, value2, "tsm7");
            return (Criteria) this;
        }

        public Criteria andTsm8IsNull() {
            addCriterion("tsm8 is null");
            return (Criteria) this;
        }

        public Criteria andTsm8IsNotNull() {
            addCriterion("tsm8 is not null");
            return (Criteria) this;
        }

        public Criteria andTsm8EqualTo(String value) {
            addCriterion("tsm8 =", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8NotEqualTo(String value) {
            addCriterion("tsm8 <>", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8GreaterThan(String value) {
            addCriterion("tsm8 >", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8GreaterThanOrEqualTo(String value) {
            addCriterion("tsm8 >=", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8LessThan(String value) {
            addCriterion("tsm8 <", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8LessThanOrEqualTo(String value) {
            addCriterion("tsm8 <=", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8Like(String value) {
            addCriterion("tsm8 like", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8NotLike(String value) {
            addCriterion("tsm8 not like", value, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8In(List<String> values) {
            addCriterion("tsm8 in", values, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8NotIn(List<String> values) {
            addCriterion("tsm8 not in", values, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8Between(String value1, String value2) {
            addCriterion("tsm8 between", value1, value2, "tsm8");
            return (Criteria) this;
        }

        public Criteria andTsm8NotBetween(String value1, String value2) {
            addCriterion("tsm8 not between", value1, value2, "tsm8");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("createDate like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("createDate not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(String value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(String value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(String value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(String value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(String value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(String value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLike(String value) {
            addCriterion("modifyDate like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotLike(String value) {
            addCriterion("modifyDate not like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<String> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<String> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(String value1, String value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(String value1, String value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
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