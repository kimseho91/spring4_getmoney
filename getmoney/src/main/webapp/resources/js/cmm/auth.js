"use strict";
var auth = auth || {}
auth = (()=>{
	const WHEN_ERR = '호출하는 JS파일을 찾을 수 없습니다.';
	let _,js,auth_vuejs;
	let init =()=>{
		_ = $.ctx()
		js = $.js()
		auth_vuejs = js+'/vue/auth_vue.js'
	}
	let onCreate =()=>{
		init();
		$('#a_go_join').click(()=>{
			alert('회원가입 클릭 !!')
			$.when(
				$.getScript(auth_vuejs)
			)
			.done(()=>{
				$('head').html(auth_vue.join_head())
				$('body').html(auth_vue.join_body())
			$('<div>',{
				text: 'Continue to checkout',
				href: '#',
				click : e=>{
					e.preventDefault();
					let data = {mid : $('#customerid').val(), mpw : $('#password').val()}
						alert('전송되는 데이터 : '+data.mid)
					$.ajax({
						url : _+'/customer/join',
						type : 'POST',
						dataType : 'json',
						data : JSON.stringify(data),
						contentType : 'application/json',
						success : d => {
							alert('AJAX 성공 아이디: '+d.mid+', 성공비번: '+d.mpw)
						},
						error : e => {
							alert('AJAX 실패')
						}
					})
				}
			})
			.addClass('btn btn-primary btn-lg btn-black')
			.appendTo('#btn_join')
			})
			.fail(()=>{alert(WHEN_ERR)}
			)
		})
	}
	return{onCreate : onCreate}
})();