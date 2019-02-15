/**
 * Created by sun on 2019/2/15 16:03
 */

//登录
$(".loginBtn").click(function () {
    //空验证-账户
    if(baseUtils.isEmpty($(".username"))){
        baseUtils.tip("账号不能为空",2,2000);
    }
});
