package weibo_login;

public class WeiboCrawlerConstant {
	
	public static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36";
	public static final String INDEX_PAGE = "http://weibo.cn"; // 手机微博首页
	public static final String USER_TABLE = "user";
	public static final String WEIBO_TABLE = "weibo_1";
	public static final String NEWUSER_TABLE = "newuser";
	public static final String OLDUSER_TABLE = "olduser";
	public static final String USER_RELATIONSHIP_TABLE = "user_relationship";
	public static final String MYSQLURL = "jdbc:mysql://127.0.0.1:3306/weibo?useUnicode=true&characterEncoding=utf8";
	public static final String MYSQL_USERNAME = "root";
	public static final String MYSQL_PASSWORD = "root";
	public static final Integer WEIBO_THREAD_INTEGER = 4;
	public static final Integer WAIT_TIME = 3000 * WEIBO_THREAD_INTEGER; // ms
	public static final Long CRAWLER_PEROID = 10l * 60l * 1000l; //ms
	public static final Integer FOLLOW_THREAD = 0;
	public static final Integer THREAD_NUM = WEIBO_THREAD_INTEGER + FOLLOW_THREAD;
	
	public static final Long CRAWLER_WEIBO_PEROID = 10l * 60l*1000; //爬取微博的周期
	public static final Integer CRAWLER_USER_PEROID = 10;// 爬取用户的周期,小时

}
