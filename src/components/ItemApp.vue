<template>

  <div id="item">
    
    <img id="img" src="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/7a122371-0984-4da4-9a42-50ea65fe7e30/chaussure-dunk-high-retro-pour-Q8PssZ.png" alt="" @click="showcom()">

    <div id="infos">

      <h1 id="title">Nike Dunk High Retro</h1>

      <div id="compra">

        <p id="price">119,99 €</p>
        
        <button class="btn"> Add comment</button>

      </div>
    
    </div>

  </div>

  <div id="extension" v-show="infos">

    <div id="show">

      <div id="top">

        <div id="sectionitem">
          <h1 id="title">Nike Dunk High Retro</h1>
          
          <div>★★★★☆</div>
          
          <div @click="showcom()">❌</div>
        </div>

        <div id="sectionuser">
          Gianluca
          2022
          Sneakers
        </div>

      </div>

      <div id="mid">
      
      </div>

      <div id="bot">

        <input type="text">

        <select id="star">
          <option disabled selected> Rate </option>
          <option value="1">★</option>
          <option value="2">★★</option>
          <option value="3">★★★</option>
          <option value="4">★★★★</option>
          <option value="5">★★★★★</option>
        </select>

        <button class="btn">Post comment</button>
      
      </div>


    </div>
  
  </div>



</template>

<script>



  
export default {
  components: {  },

  data() {
    return {
      infos: false
    }
  },

  methods: {
    showcom() {
      this.infos = !this.infos;
    }
  }
}

</script>


<style scoped="css">
* {

  font-size: 3vh;


}


#item {

  display: flex;

  flex-direction: column;

  justify-content: space-between;

  align-items: center;

  padding: 1vh;

  margin-bottom: 1vh;

  z-index: 1;


  width: fit-content;
}

#img {

  width: 40vh;

  border-radius: 3vh;

  cursor: pointer;

}


#compra {

  display: flex;

  justify-content: space-around;

  align-items: center;

  margin-top: 2vh;

}


.btn{
  
    background-color: #000;
  
    color: #fff;
  
    border: none;
  
    border-radius: 3vh;
  
    padding: 2vh;

    font-size: 1.5vh;

    cursor: pointer;
  
}

#price {

  color: #000;

  font-weight: bold;

  font-size: 2vh;

}


#extension {

  width: 100%;

  height: 100vh;

  display: flex;

  justify-content: center;

  align-items: center;

  bottom: 0;

  z-index: 5;

  position: absolute;

  background-color: rgba(0, 0, 0, 0.5);


}

#show {

  display: flex;

  flex-direction: column;

  width: 70vh;

  height: 70vh;

  padding: 1vh;

  background-color: rgb(235, 235, 235);

  border-radius: 3vh;

  cursor: pointer;

}

#top {

  display: flex;

  flex-direction: column;

  padding-right: 1vh;
  padding-left: 1vh;
  padding-top: 1vh;

  border-radius: 3vh;

  cursor: pointer;

}

#sectionitem {

  display: flex;

  justify-content: space-between;

  align-items: center;

  border-radius: 3vh;

  cursor: pointer;

}

#sectionuser {

  display: flex;

  align-items: center;

  font-size: 2vh;

  border-radius: 3vh;

  cursor: pointer;


}


#mid {

  display: flex;

  flex-direction: column;

  justify-content: space-between;

  align-items: center;

  border-radius: 1vh;

  background-color: #fff;

  padding: 1vh;

  margin-top: 1vh;

  height: 50vh;

  overflow: auto;

}

#bot {

  display: flex;

  justify-content: space-between;

  align-items: center;

  margin-top: 1vh;

  border-radius: 3vh;

  cursor: pointer;

}

input {
  width: 40vh;
  height: 5vh;
  border: none;
  border-radius: 3vh;
  padding: 1vh;
  font-size: 2vh;
}
</style>
