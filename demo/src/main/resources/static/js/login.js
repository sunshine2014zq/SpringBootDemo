/**
 * Created by sun on 2019/2/15 16:03
 */

//登录
$(".loginBtn").click(function () {
    //空验证-账户
    if(baseUtils.isEmpty($(".username"))){
        baseUtils.tip("账号不能为空",2,2000);
        return;
    }
    var formData = $(".loginForm").serializeObject();
    baseUtils.post(new Vue(),"/login",formData,function (response) {
        console.log(response)

        if(response.body.status){
            window.location.href = "/index.html";
            baseUtils.tip(response.body.msg,1,1500);
        }else {
            baseUtils.tip(response.body.msg,2,1500);
        }
    })
});
