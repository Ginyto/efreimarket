<template>

  <div id="item">
    
    <img id="img" src="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/7a122371-0984-4da4-9a42-50ea65fe7e30/chaussure-dunk-high-retro-pour-Q8PssZ.png" alt="" @click="showcom()">

    <div id="infos">

      <h1 id="title">Nike Dunk High Retro</h1>

      <div id="compra">

        <p id="price">119,99 €</p>
        
        <button id="btn"> Add to cart</button>

      </div>
    
    </div>

  </div>



</template>

<script>



  
export default {
  components: {  },

  data() {
    return {
      comOn: false
    }
  },

  methods: {
    showcom() {
      this.comOn = !this.comOn;
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


#btn{
  
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

</style>
