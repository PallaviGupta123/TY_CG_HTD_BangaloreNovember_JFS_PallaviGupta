import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  imageList = [
    {
      name: '',
      description: '',
      img: '../../assets/images/timber1.jpg'
    },
    {
      name: '',
      description: '',
      img: '../../assets/images/timber2.jpg'
    },
    {
      name: '',
      description: '',
      img: '../../assets/images/timber3.jpg'
    },
    {
      name: '',
      description: '',
      img: '../../assets/images/timber2.jpg'
    },
    {
      name: '',
      description: '',
      img: '../../assets/images/timber1.jpg'
    },

  ];

  constructor() { }

  ngOnInit() {
  }


}
