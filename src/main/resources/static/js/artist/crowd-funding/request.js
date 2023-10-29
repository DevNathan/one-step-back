$(function (e){
    // 아티스트 수락
    $(".crowd-funding-content").each(function(e) {
        var article = $(this);

        // 수락하기 버튼 클릭 시
        article.find(".accept-btn").click(function() {
            article.find(".btn-wrap").slideUp(200);
            article.find(".submit-input-wrap").slideDown(200);
        });

        // 뒤로가기 버튼 클릭 시
        article.find(".accept-cancel-btn").click(function(e) {
            e.preventDefault();
            article.find(".btn-wrap").slideDown(200);
            article.find(".submit-input-wrap").slideUp(200);
        });
    });

    // 요청 작성
    $("#slidedownBtn").click(function() {
        $(this).hide();
        $(".request-form-wrap").slideDown(200);
    });

    // 취소하기 버튼을 누를 때
    $(".cancel-btn").click(function() {
        $("#slidedownBtn").show();
        $(".request-form-wrap").slideUp(200);
    });

    $("#fundingRequestTitle").keyup(function (){
        if($(this).val){
            $(this).css("color", "black");
        }
    });

    $("#fundingRequestContent").keyup(function (){
        if($(this).val){
            $(this).css("color", "black");
        }
    })
})