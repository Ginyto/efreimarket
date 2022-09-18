<template>

  <div id="navbar">

    <nav>
      <router-link :to="{ name : 'home' }">Home</router-link> |
      <router-link :to="{ name : 'about' }">About</router-link>
    </nav>

    <div id="seek">
      
      <input type="text" placeholder="Search"  v-model="seek">
    
    </div>

    <img src="../assets/logo.svg" alt="">
  
  </div>

</template>

<script>

export default {

  name: "NavBar",

  created() { },
  
  data() {
    return {

      seek : ''

    };
  },

  props: {},

  methods: {},

};
</script>

<style lang="css" scoped>

#navbar {
  display: flex;

  justify-content: space-between ;

  align-items: center;

  padding: 3vh;

  margin-bottom: 1vh;

  width: 100%;

  background-color: rgba(244, 244, 244, 0.7);
}


input {
  width: 40vh;
  height: 5vh;
  border: none;
  border-radius: 3vh;
  padding: 1vh;
  font-size: 2vh;
}

img {
  width: 5vh;
}


</style>