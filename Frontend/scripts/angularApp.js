var content = 
[
      {
        id: "1",
        latest_message: {
          body: "Moi!",
          from_user: {
            id: "1",
            name: "John",
            avatar_url: "http://placekitten.com/g/300/300",
          },
          created_at: "2016-08-25T10:15:00.670Z",
        },
      },
      {
        id: "2",
        latest_message: {
          body: "Hello!",
          from_user: {
            id: "3",
            name: "Jeremy",
            avatar_url: "http://placekitten.com/g/302/302",
          },
          created_at: "2016-08-24T10:15:00.670Z",
        },
      },
      {
        id: "3",
        latest_message: {
          body: "Hi!",
          from_user: {
            id: "1",
            name: "John",
            avatar_url: "http://placekitten.com/g/300/300",
          },
          created_at: "2016-08-23T10:15:00.670Z",
        },
      },
      {
        id: "4",
        latest_message: {
          body: "Morning!",
          from_user: {
            id: "5",
            name: "Charles",
            avatar_url: "http://placekitten.com/g/304/304",
          },
          created_at: "2016-08-22T10:15:00.670Z",
        },
      },
      {
        id: "5",
        latest_message: {
          body: "Pleep!",
          from_user: {
            id: "6",
            name: "George",
            avatar_url: "http://placekitten.com/g/305/305",
          },
          created_at: "2016-08-21T10:15:00.670Z",
        },
      },
]

var app = angular.module("socialMedia", []); 
app.controller("socialCtrl", function($scope) {
    $scope.timelineContent = content;
});