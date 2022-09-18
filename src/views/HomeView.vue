<template>

  <div id="stock">
  
    <ItemApp />
    <ItemApp />
    <ItemApp />
    <ItemApp />
    <ItemApp />
    <ItemApp />

  
  </div>

</template>

<script>
import ItemApp from '@/components/ItemApp.vue';
// @ is an alias to /src


export default {

  components: {
    ItemApp
  }

}

</script>


<style scoped="css">


#stock {

  display: flex;

  justify-content: center;

  align-items: center;

  padding: 1vh;

  flex-wrap: wrap;


}


</style>
