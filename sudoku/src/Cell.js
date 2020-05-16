/* eslint-disable eqeqeq */
import React from 'react';
//ต้องไม่มีstate
const Cell =({isInitial,number,onChange}) => (
  //alert เเจ้งเตือน เเต่เราไม่สามารถเปลี่ยนแปลง prop ได้ ต้องเริ่มใช้state
 <div onClick={ (e)=>{
    if(isInitial){
      return;
    }
    onChange((number+1)%5)
   
   }}  
    //  สร้างpropsให้สีเทา
   className ={`cell ${isInitial ? 'initial':''}`}
   >
      {/* */}
  {number != 0 && number}
  </div>
);


export default Cell;


