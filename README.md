# InternshipSpringProjectDarwin
Hi there! This is the project which I worked on during my summer internship in Etiya. This project is a scaled-down simulation of an e-commerce website's backend. For this project, I've given a database which has 
  * user
  * general status
  * general type
  * customer order
  * customer order characteristic value
  * product offer
  * product offer characteristic value
```
 /\_/\  
( o.o ) 
 > ^ <

```
And I've told to create two APIs: createUser and inquireUser. Also I've given a relational database table queries that will help me to have base tables for statuses, types, and etc.

While completing the project, I've created a structure like this:

    com 
    +- example 
        +- darwinproject 
            +- DarwinProjectApplication.java 
            +- config 
                +- CreateRequest.java 
                +- CreateResponse.java 
                +- GenericListResponse.java 
                +- GenericResponse.java 
                +- InquireRequest.java
            +- controller 
                +- Usercontroller.java
            +- domain
                +- dto
                  +- Base.java 
                  +- CustomerOrder.java 
                  +- CustomerOrderCharValue.java 
                  +- DarwinUser.java 
                  +- GeneralChar.java 
                  +- GeneralStatus.java 
                  +- GeneralType.java 
                  +- ProductOffer.java 
                  +- ProductOfferChar.java
                  +- ProductOfferCharValue.java 
                +- entities 
                  +- BaseEntity.java 
                  +- CustOrd.java 
                  +- CustOrChVal.java 
                  +- DarwinUser.java 
                  +- GnlCh.java 
                  +- GnlSt.java 
                  +- GnlTp.java 
                  +- ProdOfr.java 
                  +- ProdOfrCh.java
                  +- ProdOfrChVal.java
            +- exception
              +- UserExistsException.java
              +- UserNotFoundException.java
            +- mapper
              +- GeneralStatusMapper.java
              +- GeneralTypeMapper.java
              +- UserMapper.java
            +- repository
              +- StatusRepository.java
              +- TypeRepository.java
              +- UserRepository.java
            +- service
              +- UserService.java
            +- util
              +- ValidUsername.java
              +- ValidUsernameValidator.java

              
