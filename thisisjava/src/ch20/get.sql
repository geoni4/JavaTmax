select * from users;

update users set userpassword='3456' where userid='hong';

delete from users where userid='jang';

select * from boards;

select bno, btitle, bcontent, bwriter, bdate, bfilename from boards;

select decode(userpassword, '1234', 0, 1)
	from users where userid = 'kim';


select * from accounts;
