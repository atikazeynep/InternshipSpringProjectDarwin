create table darwin_user (cdate date, udate date, st_id bigint not null, user_id bigint not null, user_tp_id bigint not null, pwd varchar(255), scr_name varchar(255), uname varchar(255), primary key (user_id));create table cut_ord (udate date, cdate timestamp(6), cuser bigint, cust_ord_id bigint not null, cust_ord_st_id bigint not null, prod_ofr_id bigint not null, usr_id bigint not null, uuser bigint, primary key (cust_ord_id));
alter table if exists cut_ord add constraint FKfysoel7mjtcx4qusaxvv9q9ar foreign key (cuser) references darwin_user;
alter table if exists cut_ord add constraint FKl63fl3o69x7f3a07nttc9tvan foreign key (uuser) references darwin_user;
create table cut_ord (udate date, cdate timestamp(6), cuser bigint, cust_ord_id bigint not null, cust_ord_st_id bigint not null, prod_ofr_id bigint not null, usr_id bigint not null, uuser bigint, primary key (cust_ord_id));
create table darwin_user (cdate date, udate date, st_id bigint not null, user_id bigint not null, user_tp_id bigint not null, pwd varchar(255), scr_name varchar(255), uname varchar(255), primary key (user_id));
alter table if exists cut_ord add constraint FKfysoel7mjtcx4qusaxvv9q9ar foreign key (cuser) references darwin_user;
alter table if exists cut_ord add constraint FKl63fl3o69x7f3a07nttc9tvan foreign key (uuser) references darwin_user;
