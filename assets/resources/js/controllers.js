(function(){

	function TopHotCtrl($scope, quesionService) {
	    quesionService.getTopHot(function(questions){
	        $scope.questions = questions;
	    });
	}

	angular
	.module('sofahelp')
	.controller('TopHotCtrl', TopHotCtrl);
	
})();

