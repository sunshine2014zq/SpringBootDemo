/**
 * Created by sun on 2019/2/15 16:03
 */

//登录
$(".loginBtn").click(function () {
    //空验证-账户
    if(baseUtils.isEmpty($(".username"))){
        layer.msg("账号不能为空");
    }
});
